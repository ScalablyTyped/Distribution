package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class describes all the methods that apply at dimension level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the dimension.
  */
trait IGenericDimension extends js.Object {
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns - A promise of a Qlik engine reply.
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[scala.Unit]
  /**
    * Returns the definition of a dimension.
    *
    * @returns - A promise GenericDimension.
    */
  def getDimension(): js.Promise[IGenericDimensionProperties]
  /**
    * Returns the type and identifier of the object.
    */
  def getInfo(): js.Promise[INxInfo]
  /**
    * Evaluates a dimension and displays its properties, including the dynamic properties.
    *
    * @returns - A promise GenericDimensionLayout.
    */
  def getLayout(): js.Promise[IGenericDimensionLayout]
  /**
    * Return a lists the linked objects to a generic object, a dimension or a measure.
    * @returns - A promise Array of NxLinkedObjectInfo
    */
  def getLinkedObjects(): js.Promise[js.Array[INxLinkedObjectInfo]]
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the dimension.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    */
  def getProperties(): js.Promise[IGenericDimensionProperties]
  /**
    * Publishes a dimension.
    */
  def publish(): js.Promise[scala.Unit]
  /**
    * Sets some properties for a dimension.
    */
  def setProperties(): js.Promise[IGenericDimensionProperties]
  /**
    * Unpublishes a dimension.
    */
  def unPublish(): js.Promise[scala.Unit]
}

object IGenericDimension {
  @scala.inline
  def apply(
    applyPatches: js.Function1[js.Array[INxPatch], js.Promise[scala.Unit]],
    getDimension: js.Function0[js.Promise[IGenericDimensionProperties]],
    getInfo: js.Function0[js.Promise[INxInfo]],
    getLayout: js.Function0[js.Promise[IGenericDimensionLayout]],
    getLinkedObjects: js.Function0[js.Promise[js.Array[INxLinkedObjectInfo]]],
    getProperties: js.Function0[js.Promise[IGenericDimensionProperties]],
    publish: js.Function0[js.Promise[scala.Unit]],
    setProperties: js.Function0[js.Promise[IGenericDimensionProperties]],
    unPublish: js.Function0[js.Promise[scala.Unit]]
  ): IGenericDimension = {
    val __obj = js.Dynamic.literal(applyPatches = applyPatches, getDimension = getDimension, getInfo = getInfo, getLayout = getLayout, getLinkedObjects = getLinkedObjects, getProperties = getProperties, publish = publish, setProperties = setProperties, unPublish = unPublish)
  
    __obj.asInstanceOf[IGenericDimension]
  }
}

