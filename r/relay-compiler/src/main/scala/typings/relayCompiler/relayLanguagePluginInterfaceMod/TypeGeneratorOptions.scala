package typings.relayCompiler.relayLanguagePluginInterfaceMod

import typings.relayCompiler.iRMod.Root
import typings.relayCompiler.relayFlowTypeTransformersMod.ScalarTypeMapping
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeGeneratorOptions extends js.Object {
  /**
    * A map of custom scalars to scalars that the plugin knows about and emits
    * type information for.
    *
    * @example
    *
    *  // The URL custom scalar is essentially a string and should be treated as
    *  // such by the language’s type system.
    *  { URL: 'String' }
    */
  val customScalars: ScalarTypeMapping = js.native
  /**
    * Import flow types from the Haste-style global module name or per-enum
    * global module name given by the function variant.
    */
  val enumsHasteModule: js.UndefOr[String | (js.Function1[/* enumName */ String, String])] = js.native
  /**
    * Lists all other fragments relay-compiler knows about. Use this to know when
    * to import/reference other artifacts.
    */
  val existingFragmentNames: Set[String] = js.native
  /**
    * This option controls whether or not a catch-all entry is added to enum type
    * definitions for values that may be added in the future. Enabling this means
    * you will have to update your application whenever the GraphQL server schema
    * adds new enum values to prevent it from breaking.
    *
    * This defaults to `false`.
    */
  val noFutureProofEnums: Boolean = js.native
  /**
    * Optional normalization IR for generating raw response
    */
  val normalizationIR: js.UndefOr[Root] = js.native
  /**
    * @todo Document this.
    */
  val optionalInputFields: js.Array[String] = js.native
  /**
    * Whether or not the Haste module system is being used. This will currently
    * always be `false` for OSS users.
    */
  val useHaste: Boolean = js.native
  /**
    * Whether or not relay-compiler will store artifacts next to the module that
    * they originate from or all together in a single directory.
    *
    * Storing all artifacts in a single directory makes it easy to import and
    * reference fragments defined in other artifacts without needing to use the
    * Haste module system.
    *
    * This defaults to `false`.
    */
  val useSingleArtifactDirectory: Boolean = js.native
}

object TypeGeneratorOptions {
  @scala.inline
  def apply(
    customScalars: ScalarTypeMapping,
    existingFragmentNames: Set[String],
    noFutureProofEnums: Boolean,
    optionalInputFields: js.Array[String],
    useHaste: Boolean,
    useSingleArtifactDirectory: Boolean
  ): TypeGeneratorOptions = {
    val __obj = js.Dynamic.literal(customScalars = customScalars.asInstanceOf[js.Any], existingFragmentNames = existingFragmentNames.asInstanceOf[js.Any], noFutureProofEnums = noFutureProofEnums.asInstanceOf[js.Any], optionalInputFields = optionalInputFields.asInstanceOf[js.Any], useHaste = useHaste.asInstanceOf[js.Any], useSingleArtifactDirectory = useSingleArtifactDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeGeneratorOptions]
  }
  @scala.inline
  implicit class TypeGeneratorOptionsOps[Self <: TypeGeneratorOptions] (val x: Self) extends AnyVal {
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
    def setCustomScalars(value: ScalarTypeMapping): Self = this.set("customScalars", value.asInstanceOf[js.Any])
    @scala.inline
    def setExistingFragmentNames(value: Set[String]): Self = this.set("existingFragmentNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoFutureProofEnums(value: Boolean): Self = this.set("noFutureProofEnums", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalInputFieldsVarargs(value: String*): Self = this.set("optionalInputFields", js.Array(value :_*))
    @scala.inline
    def setOptionalInputFields(value: js.Array[String]): Self = this.set("optionalInputFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseHaste(value: Boolean): Self = this.set("useHaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseSingleArtifactDirectory(value: Boolean): Self = this.set("useSingleArtifactDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnumsHasteModuleFunction1(value: /* enumName */ String => String): Self = this.set("enumsHasteModule", js.Any.fromFunction1(value))
    @scala.inline
    def setEnumsHasteModule(value: String | (js.Function1[/* enumName */ String, String])): Self = this.set("enumsHasteModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumsHasteModule: Self = this.set("enumsHasteModule", js.undefined)
    @scala.inline
    def setNormalizationIR(value: Root): Self = this.set("normalizationIR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizationIR: Self = this.set("normalizationIR", js.undefined)
  }
  
}

