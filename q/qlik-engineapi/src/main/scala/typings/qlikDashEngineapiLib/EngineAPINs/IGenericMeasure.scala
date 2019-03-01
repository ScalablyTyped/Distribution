package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at measure level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the measure.
  */
trait IGenericMeasure
  extends qlikDashEngineapiLib.enigmaJSNs.IGeneratedAPI {
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns -
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[scala.Unit]
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
  def publish(): js.Promise[scala.Unit]
  /**
    * Sets some properties for a measure.
    * @param qProp - Information about the measure.
    * This parameter is mandatory.
    * @returns - A Promise of GenericMeasureProperties
    */
  def setProperties(qProp: IGenericMeasureProperties): js.Promise[scala.Unit]
  /**
    * Unpublishes a measure.
    */
  def unPublish(): js.Promise[scala.Unit]
}

object IGenericMeasure {
  @scala.inline
  def apply(
    applyPatches: js.Function1[js.Array[INxPatch], js.Promise[scala.Unit]],
    getInfo: js.Function0[js.Promise[INxInfo]],
    getLayout: js.Function0[js.Promise[IGenericMeasureLayout]],
    getLinkedObjects: js.Function0[js.Promise[INxLinkedObjectInfo]],
    getMeasure: js.Function0[js.Promise[IGenericMeasureProperties]],
    getProperties: js.Function0[js.Promise[IGenericMeasureProperties]],
    publish: js.Function0[js.Promise[scala.Unit]],
    setProperties: js.Function1[IGenericMeasureProperties, js.Promise[scala.Unit]],
    unPublish: js.Function0[js.Promise[scala.Unit]]
  ): IGenericMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyPatches")(applyPatches)
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.updateDynamic("getLayout")(getLayout)
    __obj.updateDynamic("getLinkedObjects")(getLinkedObjects)
    __obj.updateDynamic("getMeasure")(getMeasure)
    __obj.updateDynamic("getProperties")(getProperties)
    __obj.updateDynamic("publish")(publish)
    __obj.updateDynamic("setProperties")(setProperties)
    __obj.updateDynamic("unPublish")(unPublish)
    __obj.asInstanceOf[IGenericMeasure]
  }
}

