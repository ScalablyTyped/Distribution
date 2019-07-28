package typings.projectDashOxford.projectDashOxfordMod

import typings.bluebird.bluebirdMod.^
import typings.projectDashOxford.Anon_PersonId
import typings.projectDashOxford.projectDashOxfordMod.PersonResponsesNs.Face
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("project-oxford", "Person")
@js.native
class Person () extends js.Object {
  /**
    * Adds a face to a person for identification. The maximum face count for each person is 32.
    * The face ID must be added to a person before its expiration. Typically a face ID expires
    * 24 hours after detection.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string} personId          - The target person that the face is added to.
    * @param {string} faceId            - The ID of the face to be added. The maximum face amount for each person is 32.
    * @param {string} userData          - Optional. Attach user data to person's face. The maximum length is 1024.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def addFace(personGroupId: String, personId: String, faceId: String): ^[Unit] = js.native
  def addFace(personGroupId: String, personId: String, faceId: String, userData: String): ^[Unit] = js.native
  /**
    * Creates a new person in a specified person group for identification.
    * The number of persons has a subscription limit. Free subscription amount is 1000 persons.
    * The maximum face count for each person is 32.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string[]} faces           - Array of face id's for the target person
    * @param {string} name              - Target person's display name. The maximum length is 128.
    * @param {string} userData          - Optional fields for user-provided data attached to a person. Size limit is 16KB.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def create(personGroupId: String, faces: js.Array[String], name: String, userData: String): ^[Anon_PersonId] = js.native
  /**
    * Deletes an existing person from a person group.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string} personId          - The target person to delete.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def delete(personGroupId: String, personId: String): ^[Unit] = js.native
  /**
    * Deletes a face from a person.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string} personId          - The target person that the face is removed from.
    * @param {string} faceId            - The ID of the face to be deleted.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def deleteFace(personGroupId: String, personId: String, faceId: String): ^[Unit] = js.native
  /**
    * Gets an existing person from a person group.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string} personId          - The target person to get.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def get(personGroupId: String, personId: String): ^[typings.projectDashOxford.projectDashOxfordMod.PersonResponsesNs.Person] = js.native
  /**
    * Get a face for a person.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string} personId          - The target person that the face is to get from.
    * @param {string} faceId            - The ID of the face to get.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def getFace(personGroupId: String, personId: String, faceId: String): ^[Face] = js.native
  /**
    * Lists all persons in a person group, with the person information.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def list(personGroupId: String): ^[
    js.Array[typings.projectDashOxford.projectDashOxfordMod.PersonResponsesNs.Person]
  ] = js.native
  /**
    * Updates a person's information.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string[]} faces           - Array of face id's for the target person
    * @param {string} name              - Target person's display name. The maximum length is 128.
    * @param {string} userData          - Optional fields for user-provided data attached to a person. Size limit is 16KB.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def update(personGroupId: String, personId: String, faces: js.Array[String], name: String, userData: String): ^[Unit] = js.native
  /**
    * Updates a face for a person.
    *
    * @param {string} personGroupId     - The target person's person group.
    * @param {string} personId          - The target person that the face is updated on.
    * @param {string} faceId            - The ID of the face to be updated.
    * @param {string} userData          - Optional. Attach user data to person's face. The maximum length is 1024.
    * @return {Promise}                 - Promise resolving with the resulting JSON
    */
  def updateFace(personGroupId: String, personId: String, faceId: String, userData: String): ^[Unit] = js.native
}

