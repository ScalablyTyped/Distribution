package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Mesh provider for a Face Mesh. Accessible through the control property on a Face Mesh RenderMesh. */
trait FaceRenderObjectProvider
  extends StObject
     with ScriptObject {
  
  /** When true, a small area in the corners of the eyes will be included in the Face Mesh geometry. */
  var eyeCornerGeometryEnabled: Boolean
  
  /** When true, eyes will be included in the Face Mesh geometry. */
  var eyeGeometryEnabled: Boolean
  
  /** When true, the general face (not including eyes and mouth) will be included in the Face Mesh geometry. */
  var faceGeometryEnabled: Boolean
  
  /** Index of the face this FaceRenderObjectProvider mirrors. */
  var faceIndex: Double
  
  /** Returns a list of all expression names being tracked. */
  def getExpressionNames(): js.Array[/* keyof snapchat-lens-studio.Expressions */ String]
  
  /** Returns the weight of the expression with the passed in name. See Expressions for valid expression names. */
  def getExpressionWeightByName(expressionName: /* keyof snapchat-lens-studio.Expressions */ String): Double
  
  /** Returns a Float32Array of all expression weights being tracked. */
  def getExpressionWeights(): js.typedarray.Float32Array
  
  /** When true, the mouth will be included in the Face Mesh geometry. */
  var mouthGeometryEnabled: Boolean
  
  /** When true, the skull will be included in the Face Mesh geometry. */
  var skullGeometryEnabled: Boolean
}
object FaceRenderObjectProvider {
  
  inline def apply(
    eyeCornerGeometryEnabled: Boolean,
    eyeGeometryEnabled: Boolean,
    faceGeometryEnabled: Boolean,
    faceIndex: Double,
    getExpressionNames: () => js.Array[/* keyof snapchat-lens-studio.Expressions */ String],
    getExpressionWeightByName: /* keyof snapchat-lens-studio.Expressions */ String => Double,
    getExpressionWeights: () => js.typedarray.Float32Array,
    getTypeName: () => String,
    isOfType: String => Boolean,
    mouthGeometryEnabled: Boolean,
    skullGeometryEnabled: Boolean
  ): FaceRenderObjectProvider = {
    val __obj = js.Dynamic.literal(eyeCornerGeometryEnabled = eyeCornerGeometryEnabled.asInstanceOf[js.Any], eyeGeometryEnabled = eyeGeometryEnabled.asInstanceOf[js.Any], faceGeometryEnabled = faceGeometryEnabled.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getExpressionNames = js.Any.fromFunction0(getExpressionNames), getExpressionWeightByName = js.Any.fromFunction1(getExpressionWeightByName), getExpressionWeights = js.Any.fromFunction0(getExpressionWeights), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), mouthGeometryEnabled = mouthGeometryEnabled.asInstanceOf[js.Any], skullGeometryEnabled = skullGeometryEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceRenderObjectProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceRenderObjectProvider] (val x: Self) extends AnyVal {
    
    inline def setEyeCornerGeometryEnabled(value: Boolean): Self = StObject.set(x, "eyeCornerGeometryEnabled", value.asInstanceOf[js.Any])
    
    inline def setEyeGeometryEnabled(value: Boolean): Self = StObject.set(x, "eyeGeometryEnabled", value.asInstanceOf[js.Any])
    
    inline def setFaceGeometryEnabled(value: Boolean): Self = StObject.set(x, "faceGeometryEnabled", value.asInstanceOf[js.Any])
    
    inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
    
    inline def setGetExpressionNames(value: () => js.Array[/* keyof snapchat-lens-studio.Expressions */ String]): Self = StObject.set(x, "getExpressionNames", js.Any.fromFunction0(value))
    
    inline def setGetExpressionWeightByName(value: /* keyof snapchat-lens-studio.Expressions */ String => Double): Self = StObject.set(x, "getExpressionWeightByName", js.Any.fromFunction1(value))
    
    inline def setGetExpressionWeights(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "getExpressionWeights", js.Any.fromFunction0(value))
    
    inline def setMouthGeometryEnabled(value: Boolean): Self = StObject.set(x, "mouthGeometryEnabled", value.asInstanceOf[js.Any])
    
    inline def setSkullGeometryEnabled(value: Boolean): Self = StObject.set(x, "skullGeometryEnabled", value.asInstanceOf[js.Any])
  }
}
