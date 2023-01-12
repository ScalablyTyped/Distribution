package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.storybookCoreCommon.storybookCoreCommonBooleans.`false`
import typings.storybookCoreCommon.storybookCoreCommonStrings.`react-docgen-typescript`
import typings.storybookCoreCommon.storybookCoreCommonStrings.`react-docgen`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypescriptOptions extends StObject {
  
  /**
    * Enables type checking within Storybook.
    *
    * @default `false`
    */
  var check: Boolean
  
  /**
    * Configures `fork-ts-checker-webpack-plugin`
    */
  var checkOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin.^['options'] */ js.Any
  ] = js.undefined
  
  /**
    * Sets the type of Docgen when working with React and TypeScript
    *
    * @default `'react-docgen-typescript'`
    */
  var reactDocgen: `react-docgen-typescript` | `react-docgen` | `false`
  
  /**
    * Configures `react-docgen-typescript-plugin`
    *
    * @default
    * @see https://github.com/storybookjs/storybook/blob/next/lib/builder-webpack5/src/config/defaults.js#L4-L6
    */
  var reactDocgenTypescriptOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginOptions */ Any
}
object TypescriptOptions {
  
  inline def apply(
    check: Boolean,
    reactDocgen: `react-docgen-typescript` | `react-docgen` | `false`,
    reactDocgenTypescriptOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginOptions */ Any
  ): TypescriptOptions = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], reactDocgen = reactDocgen.asInstanceOf[js.Any], reactDocgenTypescriptOptions = reactDocgenTypescriptOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypescriptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypescriptOptions] (val x: Self) extends AnyVal {
    
    inline def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin.^['options'] */ js.Any
    ): Self = StObject.set(x, "checkOptions", value.asInstanceOf[js.Any])
    
    inline def setCheckOptionsUndefined: Self = StObject.set(x, "checkOptions", js.undefined)
    
    inline def setReactDocgen(value: `react-docgen-typescript` | `react-docgen` | `false`): Self = StObject.set(x, "reactDocgen", value.asInstanceOf[js.Any])
    
    inline def setReactDocgenTypescriptOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginOptions */ Any
    ): Self = StObject.set(x, "reactDocgenTypescriptOptions", value.asInstanceOf[js.Any])
  }
}
