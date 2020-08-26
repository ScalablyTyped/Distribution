package typings.relayCompiler.anon

import typings.relayCompiler.iRMod.GeneratedDefinition
import typings.relayCompiler.relayCompilerStrings.Fragment
import typings.relayCompiler.relayCompilerStrings.Request
import typings.relayRuntime.relayConcreteNodeMod.GeneratedNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConcreteText extends js.Object {
  /**
    * The IR for the document that this module represents.
    */
  var concreteText: String = js.native
  /**
    * The IR node from which the generated node is derived.
    */
  var definition: GeneratedDefinition = js.native
  /**
    * The actual document that this module represents.
    */
  var docText: Null | String = js.native
  /**
    * The type of artifact that this module represents.
    *
    * @todo Document when this can be `empty`.
    */
  var documentType: Fragment | Request | Null = js.native
  /**
    * A hash of the concrete node including the query text.
    *
    * @todo Document how this is different from `sourceHash`.
    */
  var hash: Null | String = js.native
  /**
    * The 'kind' of the generated node.
    */
  var kind: String = js.native
  /**
    * The filename of the module.
    */
  var moduleName: String = js.native
  /**
    * The generated node being written.
    */
  var node: GeneratedNode = js.native
  /**
    * A hash of the document, which is used by relay-compiler to know if it needs
    * to write a new version of the artifact.
    *
    * @todo Is this correct? And document how this is different from `hash`.
    */
  var sourceHash: String = js.native
  /**
    * The type information generated for the GraphQL selections made.
    */
  var typeText: String = js.native
}

object ConcreteText {
  @scala.inline
  def apply(
    concreteText: String,
    definition: GeneratedDefinition,
    kind: String,
    moduleName: String,
    node: GeneratedNode,
    sourceHash: String,
    typeText: String
  ): ConcreteText = {
    val __obj = js.Dynamic.literal(concreteText = concreteText.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], sourceHash = sourceHash.asInstanceOf[js.Any], typeText = typeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcreteText]
  }
  @scala.inline
  implicit class ConcreteTextOps[Self <: ConcreteText] (val x: Self) extends AnyVal {
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
    def setConcreteText(value: String): Self = this.set("concreteText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinition(value: GeneratedDefinition): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleName(value: String): Self = this.set("moduleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: GeneratedNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceHash(value: String): Self = this.set("sourceHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeText(value: String): Self = this.set("typeText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocText(value: String): Self = this.set("docText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocTextNull: Self = this.set("docText", null)
    @scala.inline
    def setDocumentType(value: Fragment | Request): Self = this.set("documentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentTypeNull: Self = this.set("documentType", null)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashNull: Self = this.set("hash", null)
  }
  
}

