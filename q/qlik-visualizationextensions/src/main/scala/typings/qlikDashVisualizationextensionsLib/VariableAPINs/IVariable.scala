package typings
package qlikDashVisualizationextensionsLib.VariableAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVariable extends js.Object {
  /**
    * Creates a variable.
    * @param qProp - Variable name or properties. Properties:
    * Name | Type | Description
    * qInfo.qId | String | Optional. Variable id. If the selected ID is already in use, a new ID is automatically set by the engine.
    * qName | String | Variable name. The name must be unique.
    * qComment | String | Optional. Comment related to the variable.
    * qDefinition | String | Optional. Variable definition.
    * qNumberPresentation | Object | Optional. Defines the format of the value.
    * qIncludeInBookmark | Boolean | Optional. Set to true to update the variable when applying a bookmark. The variable value will be persisted in the bookmark.
    * @return - Returns a promise of a variable model.
    */
  def create(qProp: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def create(qProp: js.Any): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Creates a session variable, that is a temporary variable which is not
    * persisted and needs to be recreated for each new session.
    * @param qProp - Variable properties:
    * Name | Type | Description
    * qInfo.qId | String | Optional. Variable id.
    * qName | String | Variable name.
    * qComment | String | Optional. Comment.
    * qDefinition | String | Optional. Variable definition.
    * qNumberPresentation | Object | Optional.
    * qIncludeInBookmark | Boolean | Optional. Include in bookmark flag.
    * @return - A promise of a variable model.
    */
  def createSessionVariable(qProp: js.Any): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Gets a variable by id.
    * @param qId - Variable id.
    * @return - A promise of a variable model.
    */
  def get(qId: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Gets a variable by name.
    * @param qName - Variable name.
    * @return - A promise of a variable model.
    */
  def getByName(qName: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Gets variable content.
    * @param name - Variable name.
    * @param callback - Callback to receive the content.
    * @return - A promise of a Qlik engine reply.
    */
  def getContent(name: java.lang.String, callback: js.Any): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Sets the content of a variable.
    * @param name - Variable name.
    * @param content - Variable content.
    * @return - A promise of a Qlik engine reply.
    */
  def setContent(name: java.lang.String, content: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Sets a numeric value as a variable.
    * @param qName - Variable name.
    * @param qVal - Variable value.
    * @return - A promise of a Qlik engine reply.
    */
  def setNumValue(qName: java.lang.String, qVal: scala.Double): angularLib.angularMod.IPromise[_] = js.native
  /**
    * Sets variable string value.
    * @param qName - Variable name.
    * @param qVal - Variable value.
    * @return - A promise of a Qlik engine reply.
    */
  def setStringValue(qName: java.lang.String, qVal: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
}

