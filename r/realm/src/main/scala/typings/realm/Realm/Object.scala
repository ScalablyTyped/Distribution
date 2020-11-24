package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
  */
@js.native
trait Object extends js.Object {
  
  def _objectId(): String = js.native
  
  /**
    * @returns void
    */
  def addListener(callback: ObjectChangeCallback): Unit = js.native
  
  /**
    * @returns An array of key/value pairs of the object's properties.
    */
  def entries(): js.Array[js.Tuple2[String, _]] = js.native
  
  /**
    * @returns boolean
    */
  def isValid(): Boolean = js.native
  
  /**
    * @returns An array of the names of the object's properties.
    */
  def keys(): js.Array[String] = js.native
  
  /**
    * @returns Results<T>
    */
  def linkingObjects[T](objectType: String, property: String): Results[T with Object] = js.native
  
  /**
    * @returns number
    */
  def linkingObjectsCount(): Double = js.native
  
  /**
    * @returns ObjectSchema
    */
  def objectSchema(): ObjectSchema = js.native
  
  def removeAllListeners(): Unit = js.native
  
  def removeListener(callback: ObjectChangeCallback): Unit = js.native
  
  /**
    * @returns An object for JSON serialization.
    */
  def toJSON(): js.Any = js.native
}
object Object {
  
  @scala.inline
  def apply(
    _objectId: () => String,
    addListener: ObjectChangeCallback => Unit,
    entries: () => js.Array[js.Tuple2[String, _]],
    isValid: () => Boolean,
    keys: () => js.Array[String],
    linkingObjects: (String, String) => Results[js.Any with Object],
    linkingObjectsCount: () => Double,
    objectSchema: () => ObjectSchema,
    removeAllListeners: () => Unit,
    removeListener: ObjectChangeCallback => Unit,
    toJSON: () => js.Any
  ): Object = {
    val __obj = js.Dynamic.literal(_objectId = js.Any.fromFunction0(_objectId), addListener = js.Any.fromFunction1(addListener), entries = js.Any.fromFunction0(entries), isValid = js.Any.fromFunction0(isValid), keys = js.Any.fromFunction0(keys), linkingObjects = js.Any.fromFunction2(linkingObjects), linkingObjectsCount = js.Any.fromFunction0(linkingObjectsCount), objectSchema = js.Any.fromFunction0(objectSchema), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_objectId(value: () => String): Self = this.set("_objectId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddListener(value: ObjectChangeCallback => Unit): Self = this.set("addListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEntries(value: () => js.Array[js.Tuple2[String, _]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeys(value: () => js.Array[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLinkingObjects(value: (String, String) => Results[js.Any with Object]): Self = this.set("linkingObjects", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLinkingObjectsCount(value: () => Double): Self = this.set("linkingObjectsCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjectSchema(value: () => ObjectSchema): Self = this.set("objectSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAllListeners(value: () => Unit): Self = this.set("removeAllListeners", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveListener(value: ObjectChangeCallback => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
