package typings.reactNativeAdManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNativeAdsNativeAdsManagerMod {
  
  @JSImport("react-native-ad-manager/src/native-ads/NativeAdsManager", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with NativeAdsManager {
    def this(adUnitID: String, testDevices: js.Array[String]) = this()
    
    /* CompleteClass */
    var adUnitID: String = js.native
    
    /* CompleteClass */
    var isValid: Boolean = js.native
    
    /* CompleteClass */
    override def toJSON(): String = js.native
  }
  @JSImport("react-native-ad-manager/src/native-ads/NativeAdsManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def registerViewsForInteractionAsync(nativeAdViewTag: Double, clickable: js.Array[Double]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerViewsForInteractionAsync")(nativeAdViewTag.asInstanceOf[js.Any], clickable.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait NativeAdsManager extends StObject {
    
    var adUnitID: String
    
    var isValid: Boolean
    
    def toJSON(): String
  }
  object NativeAdsManager {
    
    inline def apply(adUnitID: String, isValid: Boolean, toJSON: () => String): NativeAdsManager = {
      val __obj = js.Dynamic.literal(adUnitID = adUnitID.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[NativeAdsManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeAdsManager] (val x: Self) extends AnyVal {
      
      inline def setAdUnitID(value: String): Self = StObject.set(x, "adUnitID", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => String): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
