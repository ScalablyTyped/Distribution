package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object providerMod {
  
  type IframeRenderer = js.Function6[
    /* storyId */ java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ /* viewMode */ js.Any, 
    /* id */ java.lang.String, 
    /* baseUrl */ java.lang.String, 
    /* scale */ scala.Double, 
    /* queryParams */ typings.std.Record[java.lang.String, js.Any], 
    typings.react.mod.ReactNode
  ]
}
