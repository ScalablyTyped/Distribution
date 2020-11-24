package typings.projectOxford.mod

import typings.bluebird.mod.^
import typings.projectOxford.mod.PersonGroupResponses.TrainingStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("project-oxford", "PersonGroup")
@js.native
class PersonGroup () extends js.Object {
  
  /**
    * Creates a new person group with a user-specified ID.
    * A person group is one of the most important parameters for the Identification API.
    * The Identification searches person faces in a specified person group.
    *
    * @param  {string} personGroupId       - Numbers, en-us letters in lower case, '-', '_'. Max length: 64
    * @param  {string} name                - Person group display name. The maximum length is 128.
    * @param  {string} userData            - User-provided data attached to the group. The size limit is 16KB.
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def create(personGroupId: String, name: String, userData: String): ^[Unit] = js.native
  
  /**
    * Deletes an existing person group.
    *
    * @param  {string} personGroupId       - Name of person group to delete
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def delete(personGroupId: String): ^[Unit] = js.native
  
  /**
    * Gets an existing person group.
    *
    * @param  {string} personGroupId       - Name of person group to get
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def get(personGroupId: String): ^[typings.projectOxford.mod.PersonGroupResponses.PersonGroup] = js.native
  
  /**
    * Lists all person groups in the current subscription.
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def list(): ^[js.Array[typings.projectOxford.mod.PersonGroupResponses.PersonGroup]] = js.native
  
  /**
    * Starts a person group training.
    * Training is a necessary preparation process of a person group before identification.
    * Each person group needs to be trained in order to call Identification. The training
    * will process for a while on the server side even after this API has responded.
    *
    * @param  {string} personGroupId       - Name of person group to get
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def trainingStart(personGroupId: String): ^[TrainingStatus] = js.native
  
  /**
    * Retrieves the training status of a person group. Training is triggered by the Train PersonGroup API.
    * The training will process for a while on the server side. This API can query whether the training
    * is completed or ongoing.
    *
    * @param  {string} personGroupId       - Name of person group to get
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def trainingStatus(personGroupId: String): ^[TrainingStatus] = js.native
  
  /**
    * Updates an existing person group's display name and userData.
    *
    * @param  {string} personGroupId       - Numbers, en-us letters in lower case, '-', '_'. Max length: 64
    * @param  {string} name                - Person group display name. The maximum length is 128.
    * @param  {string} userData            - User-provided data attached to the group. The size limit is 16KB.
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def update(personGroupId: String, name: String, userData: String): ^[Unit] = js.native
}
