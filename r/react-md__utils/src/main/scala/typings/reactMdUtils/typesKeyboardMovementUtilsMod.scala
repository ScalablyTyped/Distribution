package typings.reactMdUtils

import typings.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardFocusElementData
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementUtilsMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def focusElement(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getFirstFocusableIndex(watching: js.Array[KeyboardFocusElementData], includeDisabled: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusableIndex")(watching.asInstanceOf[js.Any], includeDisabled.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLastFocusableIndex(watching: js.Array[KeyboardFocusElementData], includeDisabled: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusableIndex")(watching.asInstanceOf[js.Any], includeDisabled.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNextFocusableIndex(param0: NextFocusableIndexOptions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextFocusableIndex")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getSearchText(element: HTMLElement, searchable: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSearchText")(element.asInstanceOf[js.Any], searchable.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isNotFocusable(element: Unit, includeDisabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFocusable")(element.asInstanceOf[js.Any], includeDisabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isNotFocusable(element: HTMLElement, includeDisabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotFocusable")(element.asInstanceOf[js.Any], includeDisabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @remarks \@since 5.0.0
    * @internal
    */
  trait NextFocusableIndexOptions extends StObject {
    
    var currentFocusIndex: Double
    
    var includeDisabled: Boolean
    
    var increment: Boolean
    
    var loopable: Boolean
    
    var watching: js.Array[KeyboardFocusElementData]
  }
  object NextFocusableIndexOptions {
    
    inline def apply(
      currentFocusIndex: Double,
      includeDisabled: Boolean,
      increment: Boolean,
      loopable: Boolean,
      watching: js.Array[KeyboardFocusElementData]
    ): NextFocusableIndexOptions = {
      val __obj = js.Dynamic.literal(currentFocusIndex = currentFocusIndex.asInstanceOf[js.Any], includeDisabled = includeDisabled.asInstanceOf[js.Any], increment = increment.asInstanceOf[js.Any], loopable = loopable.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextFocusableIndexOptions]
    }
    
    extension [Self <: NextFocusableIndexOptions](x: Self) {
      
      inline def setCurrentFocusIndex(value: Double): Self = StObject.set(x, "currentFocusIndex", value.asInstanceOf[js.Any])
      
      inline def setIncludeDisabled(value: Boolean): Self = StObject.set(x, "includeDisabled", value.asInstanceOf[js.Any])
      
      inline def setIncrement(value: Boolean): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setLoopable(value: Boolean): Self = StObject.set(x, "loopable", value.asInstanceOf[js.Any])
      
      inline def setWatching(value: js.Array[KeyboardFocusElementData]): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
      
      inline def setWatchingVarargs(value: KeyboardFocusElementData*): Self = StObject.set(x, "watching", js.Array(value*))
    }
  }
}
