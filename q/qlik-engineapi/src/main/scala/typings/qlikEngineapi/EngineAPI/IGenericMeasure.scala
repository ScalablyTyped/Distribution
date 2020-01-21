package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at measure level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the measure.
  */
trait IGenericMeasure extends IGeneratedAPI {
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns -
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit]
  /**
    * Returns the type and identifier of the object.
    * @returns - A Promise of NxInfo
    */
  def getInfo(): js.Promise[INxInfo]
  /**
    * Evaluates a measure and displays its properties, including the dynamic properties.
    * @returns - A Promise of GenericMeasureLayout
    */
  def getLayout(): js.Promise[IGenericMeasureLayout]
  /**
    * Lists the linked objects to a generic object, a dimension or a measure.
    * @returns - Array of NxLinkedObjectInfo
    */
  def getLinkedObjects(): js.Promise[INxLinkedObjectInfo]
  /**
    * Returns the definition of a measure
    * @returns - Information about the measure.
    * >> This parameter is mandatory.
    */
  def getMeasure(): js.Promise[IGenericMeasureProperties]
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the measure.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - A Promise GenericMeasureProperties
    * >> This parameter is mandatory.
    */
  def getProperties(): js.Promise[IGenericMeasureProperties]
  /**
    * Publishes a measure.
    */
  def publish(): js.Promise[Unit]
  /**
    * Sets some properties for a measure.
    * @param qProp - Information about the measure.
    * This parameter is mandatory.
    * @returns - A Promise of GenericMeasureProperties
    */
  def setProperties(qProp: IGenericMeasureProperties): js.Promise[Unit]
  /**
    * Unpublishes a measure.
    */
  def unPublish(): js.Promise[Unit]
}

object IGenericMeasure {
  @scala.inline
  def apply(
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getInfo: () => js.Promise[INxInfo],
    getLayout: () => js.Promise[IGenericMeasureLayout],
    getLinkedObjects: () => js.Promise[INxLinkedObjectInfo],
    getMeasure: () => js.Promise[IGenericMeasureProperties],
    getProperties: () => js.Promise[IGenericMeasureProperties],
    publish: () => js.Promise[Unit],
    setProperties: IGenericMeasureProperties => js.Promise[Unit],
    unPublish: () => js.Promise[Unit]
  ): IGenericMeasure = {
    val __obj = js.Dynamic.literal(applyPatches = js.Any.fromFunction1(applyPatches), getInfo = js.Any.fromFunction0(getInfo), getLayout = js.Any.fromFunction0(getLayout), getLinkedObjects = js.Any.fromFunction0(getLinkedObjects), getMeasure = js.Any.fromFunction0(getMeasure), getProperties = js.Any.fromFunction0(getProperties), publish = js.Any.fromFunction0(publish), setProperties = js.Any.fromFunction1(setProperties), unPublish = js.Any.fromFunction0(unPublish))
  
    __obj.asInstanceOf[IGenericMeasure]
  }
}

