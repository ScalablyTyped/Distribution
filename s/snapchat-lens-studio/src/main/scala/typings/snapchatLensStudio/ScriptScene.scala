package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Lens scene. Accessible through global.scene. */
trait ScriptScene
  extends StObject
     with ScriptObject {
  
  /** Creates a new Render Target texture with a RenderTargetProvider as its control property. */
  def createRenderTargetTexture(): Texture
  
  /** Adds a new SceneObject named name to the scene. */
  def createSceneObject(name: String): SceneObject
  
  /**
    * Returns a string describing the currently active device camera. Returns “back” if the rear-facing ( World: aka) camera is active. Returns “front” if the front-facing ( Selfie: aka) camera is
    * active. Otherwise, the camera is not initialized.
    */
  def getCameraType(): String
  
  /** Returns the root SceneObject at index index in the current scene. */
  def getRootObject(index: Double): SceneObject
  
  /** Returns the number of SceneObjects in the current scene. */
  def getRootObjectsCount(): Double
  
  /** Returns whether or not the scene is currently being recorded. */
  def isRecording(): Boolean
}
object ScriptScene {
  
  inline def apply(
    createRenderTargetTexture: () => Texture,
    createSceneObject: String => SceneObject,
    getCameraType: () => String,
    getRootObject: Double => SceneObject,
    getRootObjectsCount: () => Double,
    getTypeName: () => String,
    isOfType: String => Boolean,
    isRecording: () => Boolean
  ): ScriptScene = {
    val __obj = js.Dynamic.literal(createRenderTargetTexture = js.Any.fromFunction0(createRenderTargetTexture), createSceneObject = js.Any.fromFunction1(createSceneObject), getCameraType = js.Any.fromFunction0(getCameraType), getRootObject = js.Any.fromFunction1(getRootObject), getRootObjectsCount = js.Any.fromFunction0(getRootObjectsCount), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isRecording = js.Any.fromFunction0(isRecording))
    __obj.asInstanceOf[ScriptScene]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptScene] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderTargetTexture(value: () => Texture): Self = StObject.set(x, "createRenderTargetTexture", js.Any.fromFunction0(value))
    
    inline def setCreateSceneObject(value: String => SceneObject): Self = StObject.set(x, "createSceneObject", js.Any.fromFunction1(value))
    
    inline def setGetCameraType(value: () => String): Self = StObject.set(x, "getCameraType", js.Any.fromFunction0(value))
    
    inline def setGetRootObject(value: Double => SceneObject): Self = StObject.set(x, "getRootObject", js.Any.fromFunction1(value))
    
    inline def setGetRootObjectsCount(value: () => Double): Self = StObject.set(x, "getRootObjectsCount", js.Any.fromFunction0(value))
    
    inline def setIsRecording(value: () => Boolean): Self = StObject.set(x, "isRecording", js.Any.fromFunction0(value))
  }
}
