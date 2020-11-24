package typings.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sidebarTypesMod {
  
  type Dataset = typings.std.Record[java.lang.String, typings.storybookUi.sidebarTypesMod.Item]
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.sidebarTypesMod.SearchResult
    - typings.storybookUi.sidebarTypesMod.ExpandType
    - typings.storybookUi.sidebarTypesMod.ClearType
    - typings.storybookUi.sidebarTypesMod.CloseType
  */
  type DownshiftItem = typings.storybookUi.sidebarTypesMod._DownshiftItem | typings.storybookUi.sidebarTypesMod.SearchResult
  
  type Highlight = typings.storybookUi.sidebarTypesMod.ItemRef | scala.Null
  
  type RefType = /* import warning: importer.ImportType#apply Failed type conversion: @storybook/ui.@storybook/ui/dist/components/sidebar/types.Refs[keyof @storybook/ui.@storybook/ui/dist/components/sidebar/types.Refs] */ js.Any
  
  type Refs = /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['refs'] */ js.Any
  
  type SearchChildrenFn = js.Function1[/* args */ typings.storybookUi.anon.GetItemProps, typings.react.mod.ReactNode]
  
  type SearchItem = typings.storybookUi.sidebarTypesMod.Item with typings.storybookUi.anon.Path
  
  type SearchResult = typings.fuseJs.mod.FuseResultWithMatches[typings.storybookUi.sidebarTypesMod.SearchItem] with typings.fuseJs.mod.FuseResultWithScore[typings.storybookUi.sidebarTypesMod.SearchItem]
  
  type Selection = typings.storybookUi.sidebarTypesMod.StoryRef | scala.Null
}
