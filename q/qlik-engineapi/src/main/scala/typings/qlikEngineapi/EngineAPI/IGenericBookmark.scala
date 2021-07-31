package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.anon.QEndIndex
import typings.qlikEngineapi.anon.QFieldValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at bookmark level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the bookmark.
  */
trait IGenericBookmark extends StObject {
  
  /**
    * Applies a bookmark.
    * @returns - A promise true or false
    */
  @JSName("apply")
  def apply(): js.Promise[Boolean]
  
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns - A promise of a Qlik engine reply.
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit]
  
  /**
    * Get the selected values in the bookmark for a specific field.
    *
    * Note: from shema file
    * @param qField - Name of the field
    * @param qGetExcludedValues - Get Excluded Values
    * @param qDataPage - Start and End of DataPage
    * @returns - A promise of Array of FieldValues.
    */
  def getFieldValues(qField: String, qGetExcludedValues: Boolean, qDataPage: QEndIndex): js.Promise[QFieldValues]
  
  /**
    * Returns:
    *
    * - the type of the object
    * - the identifier of the object
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @returns - A promise InfoObject
    */
  def getInfo(): js.Promise[INxInfo]
  
  /**
    * Evaluates an object and displays its properties including the dynamic properties.
    * If the member delta is set to true in the request object, only the delta is evaluated..
    * @returns - A promise of GenericBookmarkLayout
    */
  def getLayout(): js.Promise[IGenericBookmarkLayout]
  
  /**
    * Shows the properties of an object.
    * If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - A promise of GenericBookmarkProperties
    */
  def getProperties(): js.Promise[IGenericBookmarkProperties]
  
  /**
    * Publishes a bookmark.
    * @returns - A promise of a Qlik engine reply.
    */
  def publish(): js.Promise[Unit]
  
  /**
    * Sets some properties for a bookmark.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qProp - Information about the bookmark
    * >> This parameter is mandatory.
    * @returns - A promise of a Qlik engine reply.
    */
  def setProperties(qProp: IGenericBookmarkProperties): js.Promise[Unit]
  
  /**
    * Unpublishes a bookmark.
    * @returns - A promise of a Qlik engine reply.
    */
  def unPublish(): js.Promise[Unit]
}
object IGenericBookmark {
  
  @scala.inline
  def apply(
    apply: () => js.Promise[Boolean],
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getFieldValues: (String, Boolean, QEndIndex) => js.Promise[QFieldValues],
    getInfo: () => js.Promise[INxInfo],
    getLayout: () => js.Promise[IGenericBookmarkLayout],
    getProperties: () => js.Promise[IGenericBookmarkProperties],
    publish: () => js.Promise[Unit],
    setProperties: IGenericBookmarkProperties => js.Promise[Unit],
    unPublish: () => js.Promise[Unit]
  ): IGenericBookmark = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), applyPatches = js.Any.fromFunction1(applyPatches), getFieldValues = js.Any.fromFunction3(getFieldValues), getInfo = js.Any.fromFunction0(getInfo), getLayout = js.Any.fromFunction0(getLayout), getProperties = js.Any.fromFunction0(getProperties), publish = js.Any.fromFunction0(publish), setProperties = js.Any.fromFunction1(setProperties), unPublish = js.Any.fromFunction0(unPublish))
    __obj.asInstanceOf[IGenericBookmark]
  }
  
  @scala.inline
  implicit class IGenericBookmarkMutableBuilder[Self <: IGenericBookmark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: () => js.Promise[Boolean]): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = StObject.set(x, "applyPatches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFieldValues(value: (String, Boolean, QEndIndex) => js.Promise[QFieldValues]): Self = StObject.set(x, "getFieldValues", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetInfo(value: () => js.Promise[INxInfo]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayout(value: () => js.Promise[IGenericBookmarkLayout]): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Promise[IGenericBookmarkProperties]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPublish(value: () => js.Promise[Unit]): Self = StObject.set(x, "publish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetProperties(value: IGenericBookmarkProperties => js.Promise[Unit]): Self = StObject.set(x, "setProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnPublish(value: () => js.Promise[Unit]): Self = StObject.set(x, "unPublish", js.Any.fromFunction0(value))
  }
}
