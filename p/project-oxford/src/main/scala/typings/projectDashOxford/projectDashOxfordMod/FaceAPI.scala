package typings.projectDashOxford.projectDashOxfordMod

import typings.bluebird.bluebirdMod.^
import typings.projectDashOxford.projectDashOxfordMod.FaceResponses.Grouping
import typings.projectDashOxford.projectDashOxfordMod.FaceResponses.Similar
import typings.projectDashOxford.projectDashOxfordMod.FaceResponses.Verify
import typings.projectDashOxford.projectDashOxfordMod.Options.Detect
import typings.projectDashOxford.projectDashOxfordMod.Options.Identify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("project-oxford", "FaceAPI")
@js.native
class FaceAPI () extends js.Object {
  var person: Person = js.native
  /**
    * @namespace
    * @memberof face
    */
  var personGroup: PersonGroup = js.native
  /**
    * Call the Face Detected API
    * Detects human faces in an image and returns face locations, face landmarks, and
    * optional attributes including head-pose, gender, and age. Detection is an essential
    * API that provides faceId to other APIs like Identification, Verification,
    * and Find Similar.
    *
    * @param  {object}  options                        - Options object
    * @param  {string}  options.url                    - URL to image to be used
    * @param  {string}  options.path                   - Path to image to be used
    * @param  {stream}  options.stream                 - Stream for image to be used
    * @param  {boolean} options.analyzesFaceLandmarks  - Analyze face landmarks?
    * @param  {boolean} options.analyzesAge            - Analyze age?
    * @param  {boolean} options.analyzesGender         - Analyze gender?
    * @param  {boolean} options.analyzesHeadPose       - Analyze headpose?
    * @return {Promise}                                - Promise resolving with the resulting JSON
    */
  def detect(options: Detect): ^[js.Array[typings.projectDashOxford.projectDashOxfordMod.FaceResponses.Detect]] = js.native
  /**
    * Divides candidate faces into groups based on face similarity using faceIds.
    * The output is one or more disjointed face groups and a MessyGroup.
    * A face group contains the faces that have similar looking, often of the same person.
    * There will be one or more face groups ranked by group size, i.e. number of face.
    * Faces belonging to the same person might be split into several groups in the result.
    * The MessyGroup is a special face group that each face is not similar to any other
    * faces in original candidate faces. The messyGroup will not appear in the result if
    * all faces found their similar counterparts. The candidate face list has a
    * limit of 100 faces.
    *
    * @param  {string[]} faces     - Array of faceIds to use
    * @return {Promise}            - Promise resolving with the resulting JSON
    */
  def grouping(faces: js.Array[String]): ^[Grouping] = js.native
  /**
    * Identifies persons from a person group by one or more input faces.
    * To recognize which person a face belongs to, Face Identification needs a person group
    * that contains number of persons. Each person contains one or more faces. After a person
    * group prepared, it should be trained to make it ready for identification. Then the
    * identification API compares the input face to those persons' faces in person group and
    * returns the best-matched candidate persons, ranked by confidence.
    *
    * @param  {string[]} faces     - Array of faceIds to use
    * @return {Promise}            - Promise resolving with the resulting JSON
    */
  def identify(faceIDs: js.Array[String], options: Identify): ^[js.Array[typings.projectDashOxford.projectDashOxfordMod.FaceResponses.Identify]] = js.native
  /**
    * Detect similar faces using faceIds (as returned from the detect API)
    * @param  {string} sourceFace          - String of faceId for the source face
    * @param  {string[]} candidateFaces    - Array of faceIds to use as candidates
    * @return {Promise}                    - Promise resolving with the resulting JSON
    */
  def similar(sourceFaceId: String, candidateFacesIds: js.Array[String]): ^[Similar] = js.native
  /**
    * Analyzes two faces and determine whether they are from the same person.
    * Verification works well for frontal and near-frontal faces.
    * For the scenarios that are sensitive to accuracy please use with own judgment.
    * @param  {string[]} faces     - Array containing two faceIds to use
    * @return {Promise}            - Promise resolving with the resulting JSON
    */
  def verify(faces: js.Array[String]): ^[Verify] = js.native
}

