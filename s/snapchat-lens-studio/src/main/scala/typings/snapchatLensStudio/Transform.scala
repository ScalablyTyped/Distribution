package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controls the position, rotation, and scale of a SceneObject. Every SceneObject automatically has a Transform attached.
  * Lens Studio v1.0.0+
  */
trait Transform
  extends StObject
     with ScriptObject {
  
  /** Returns the Transform’s back directional vector. */
  var back: vec3
  
  /** Returns the Transform’s down directional vector. */
  var down: vec3
  
  /** Returns the Transform’s forward directional vector. */
  var forward: vec3
  
  /** Returns the Transform’s world-to-local transformation matrix. */
  def getInvertedWorldTransform(): mat4
  
  /** Returns the Transform’s position relative to its parent. */
  def getLocalPosition(): vec3
  
  /** Returns the Transform’s rotation relative to its parent. */
  def getLocalRotation(): quat
  
  /** Returns the Transform’s scale relative to its parent. */
  def getLocalScale(): vec3
  
  /** Returns the SceneObject the Transform is attached to. */
  def getSceneObject(): SceneObject
  
  /** Returns the Transform’s position relative to the world. */
  def getWorldPosition(): vec3
  
  /** Returns the Transform’s rotation relative to the world. */
  def getWorldRotation(): quat
  
  /** Returns the Transform’s scale relative to the world. */
  def getWorldScale(): vec3
  
  /** Returns the Transform’s local-to-world transformation matrix. */
  def getWorldTransform(): mat4
  
  /** Returns the Transform’s left directional vector. */
  var left: vec3
  
  /** Returns the Transform’s right directional vector. */
  var right: vec3
  
  /** Sets the Transform’s position relative to its parent. */
  def setLocalPosition(pos: vec3): Unit
  
  /** Sets the Transform’s rotation relative to its parent. */
  def setLocalRotation(rotation: quat): Unit
  
  /** Sets the Transform’s scale relative to its parent. */
  def setLocalScale(scale: vec3): Unit
  
  /** Sets the Transform’s position relative to the world. */
  def setWorldPosition(pos: vec3): Unit
  
  /** Sets the Transform’s rotation relative to the world. */
  def setWorldRotation(rotation: quat): Unit
  
  /** Sets the Transform’s scale relative to the world. This may produce lossy results when parent objects are rotated, so use setLocalScale( instead: ) if possible. */
  def setWorldScale(scale: vec3): Unit
  
  /** Returns the Transform’s up directional vector. */
  var up: vec3
}
object Transform {
  
  inline def apply(
    back: vec3,
    down: vec3,
    forward: vec3,
    getInvertedWorldTransform: () => mat4,
    getLocalPosition: () => vec3,
    getLocalRotation: () => quat,
    getLocalScale: () => vec3,
    getSceneObject: () => SceneObject,
    getTypeName: () => String,
    getWorldPosition: () => vec3,
    getWorldRotation: () => quat,
    getWorldScale: () => vec3,
    getWorldTransform: () => mat4,
    isOfType: String => Boolean,
    left: vec3,
    right: vec3,
    setLocalPosition: vec3 => Unit,
    setLocalRotation: quat => Unit,
    setLocalScale: vec3 => Unit,
    setWorldPosition: vec3 => Unit,
    setWorldRotation: quat => Unit,
    setWorldScale: vec3 => Unit,
    up: vec3
  ): Transform = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any], getInvertedWorldTransform = js.Any.fromFunction0(getInvertedWorldTransform), getLocalPosition = js.Any.fromFunction0(getLocalPosition), getLocalRotation = js.Any.fromFunction0(getLocalRotation), getLocalScale = js.Any.fromFunction0(getLocalScale), getSceneObject = js.Any.fromFunction0(getSceneObject), getTypeName = js.Any.fromFunction0(getTypeName), getWorldPosition = js.Any.fromFunction0(getWorldPosition), getWorldRotation = js.Any.fromFunction0(getWorldRotation), getWorldScale = js.Any.fromFunction0(getWorldScale), getWorldTransform = js.Any.fromFunction0(getWorldTransform), isOfType = js.Any.fromFunction1(isOfType), left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], setLocalPosition = js.Any.fromFunction1(setLocalPosition), setLocalRotation = js.Any.fromFunction1(setLocalRotation), setLocalScale = js.Any.fromFunction1(setLocalScale), setWorldPosition = js.Any.fromFunction1(setWorldPosition), setWorldRotation = js.Any.fromFunction1(setWorldRotation), setWorldScale = js.Any.fromFunction1(setWorldScale), up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    inline def setBack(value: vec3): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setDown(value: vec3): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setForward(value: vec3): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setGetInvertedWorldTransform(value: () => mat4): Self = StObject.set(x, "getInvertedWorldTransform", js.Any.fromFunction0(value))
    
    inline def setGetLocalPosition(value: () => vec3): Self = StObject.set(x, "getLocalPosition", js.Any.fromFunction0(value))
    
    inline def setGetLocalRotation(value: () => quat): Self = StObject.set(x, "getLocalRotation", js.Any.fromFunction0(value))
    
    inline def setGetLocalScale(value: () => vec3): Self = StObject.set(x, "getLocalScale", js.Any.fromFunction0(value))
    
    inline def setGetSceneObject(value: () => SceneObject): Self = StObject.set(x, "getSceneObject", js.Any.fromFunction0(value))
    
    inline def setGetWorldPosition(value: () => vec3): Self = StObject.set(x, "getWorldPosition", js.Any.fromFunction0(value))
    
    inline def setGetWorldRotation(value: () => quat): Self = StObject.set(x, "getWorldRotation", js.Any.fromFunction0(value))
    
    inline def setGetWorldScale(value: () => vec3): Self = StObject.set(x, "getWorldScale", js.Any.fromFunction0(value))
    
    inline def setGetWorldTransform(value: () => mat4): Self = StObject.set(x, "getWorldTransform", js.Any.fromFunction0(value))
    
    inline def setLeft(value: vec3): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: vec3): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setSetLocalPosition(value: vec3 => Unit): Self = StObject.set(x, "setLocalPosition", js.Any.fromFunction1(value))
    
    inline def setSetLocalRotation(value: quat => Unit): Self = StObject.set(x, "setLocalRotation", js.Any.fromFunction1(value))
    
    inline def setSetLocalScale(value: vec3 => Unit): Self = StObject.set(x, "setLocalScale", js.Any.fromFunction1(value))
    
    inline def setSetWorldPosition(value: vec3 => Unit): Self = StObject.set(x, "setWorldPosition", js.Any.fromFunction1(value))
    
    inline def setSetWorldRotation(value: quat => Unit): Self = StObject.set(x, "setWorldRotation", js.Any.fromFunction1(value))
    
    inline def setSetWorldScale(value: vec3 => Unit): Self = StObject.set(x, "setWorldScale", js.Any.fromFunction1(value))
    
    inline def setUp(value: vec3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
