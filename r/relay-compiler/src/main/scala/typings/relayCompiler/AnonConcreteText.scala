package typings.relayCompiler

import typings.relayCompiler.iRMod.GeneratedDefinition
import typings.relayCompiler.relayCompilerStrings.Fragment
import typings.relayCompiler.relayCompilerStrings.Request
import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConcreteText extends js.Object {
  /**
    * The IR for the document that this module represents.
    */
  var concreteText: String
  /**
    * The IR node from which the generated node is derived.
    */
  var definition: GeneratedDefinition
  /**
    * The actual document that this module represents.
    */
  var docText: Null | String
  /**
    * The type of artifact that this module represents.
    *
    * @todo Document when this can be `empty`.
    */
  var documentType: Fragment | Request | Null
  /**
    * A hash of the concrete node including the query text.
    *
    * @todo Document how this is different from `sourceHash`.
    */
  var hash: Null | String
  /**
    * The 'kind' of the generated node.
    */
  var kind: String
  /**
    * The filename of the module.
    */
  var moduleName: String
  /**
    * The generated node being written.
    */
  var node: GeneratedNode
  /**
    * A hash of the document, which is used by relay-compiler to know if it needs
    * to write a new version of the artifact.
    *
    * @todo Is this correct? And document how this is different from `hash`.
    */
  var sourceHash: String
  /**
    * The type information generated for the GraphQL selections made.
    */
  var typeText: String
}

object AnonConcreteText {
  @scala.inline
  def apply(
    concreteText: String,
    definition: GeneratedDefinition,
    kind: String,
    moduleName: String,
    node: GeneratedNode,
    sourceHash: String,
    typeText: String,
    docText: String = null,
    documentType: Fragment | Request = null,
    hash: String = null
  ): AnonConcreteText = {
    val __obj = js.Dynamic.literal(concreteText = concreteText.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], sourceHash = sourceHash.asInstanceOf[js.Any], typeText = typeText.asInstanceOf[js.Any])
    if (docText != null) __obj.updateDynamic("docText")(docText.asInstanceOf[js.Any])
    if (documentType != null) __obj.updateDynamic("documentType")(documentType.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConcreteText]
  }
}

