package typings.relayDashCompiler.libLanguageRelayLanguagePluginInterfaceMod

import typings.relayDashCompiler.libCoreGraphQLIRMod.Root
import typings.relayDashCompiler.libLanguageJavascriptRelayFlowTypeTransformersMod.ScalarTypeMapping
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val customScalars: ScalarTypeMapping
  /**
    * Import flow types from the Haste-style global module name or per-enum
    * global module name given by the function variant.
    */
  val enumsHasteModule: js.UndefOr[String | (js.Function1[/* enumName */ String, String])] = js.undefined
  /**
    * Lists all other fragments relay-compiler knows about. Use this to know when
    * to import/reference other artifacts.
    */
  val existingFragmentNames: Set[String]
  /**
    * This option controls whether or not a catch-all entry is added to enum type
    * definitions for values that may be added in the future. Enabling this means
    * you will have to update your application whenever the GraphQL server schema
    * adds new enum values to prevent it from breaking.
    *
    * This defaults to `false`.
    */
  val noFutureProofEnums: Boolean
  /**
    * Optional normalization IR for generating raw response
    */
  val normalizationIR: js.UndefOr[Root] = js.undefined
  /**
    * @todo Document this.
    */
  val optionalInputFields: js.Array[String]
  /**
    * Whether or not the Haste module system is being used. This will currently
    * always be `false` for OSS users.
    */
  val useHaste: Boolean
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
  val useSingleArtifactDirectory: Boolean
}

object TypeGeneratorOptions {
  @scala.inline
  def apply(
    customScalars: ScalarTypeMapping,
    existingFragmentNames: Set[String],
    noFutureProofEnums: Boolean,
    optionalInputFields: js.Array[String],
    useHaste: Boolean,
    useSingleArtifactDirectory: Boolean,
    enumsHasteModule: String | (js.Function1[/* enumName */ String, String]) = null,
    normalizationIR: Root = null
  ): TypeGeneratorOptions = {
    val __obj = js.Dynamic.literal(customScalars = customScalars.asInstanceOf[js.Any], existingFragmentNames = existingFragmentNames.asInstanceOf[js.Any], noFutureProofEnums = noFutureProofEnums.asInstanceOf[js.Any], optionalInputFields = optionalInputFields.asInstanceOf[js.Any], useHaste = useHaste.asInstanceOf[js.Any], useSingleArtifactDirectory = useSingleArtifactDirectory.asInstanceOf[js.Any])
    if (enumsHasteModule != null) __obj.updateDynamic("enumsHasteModule")(enumsHasteModule.asInstanceOf[js.Any])
    if (normalizationIR != null) __obj.updateDynamic("normalizationIR")(normalizationIR.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeGeneratorOptions]
  }
}

