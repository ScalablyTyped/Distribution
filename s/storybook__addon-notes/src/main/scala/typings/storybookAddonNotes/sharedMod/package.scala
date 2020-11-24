package typings.storybookAddonNotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sharedMod {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.storybookAddonNotes.sharedMod.TextParameter
    - typings.storybookAddonNotes.sharedMod.MarkdownParameter
    - typings.storybookAddonNotes.sharedMod.DisabledParameter
    - typings.storybookAddonNotes.sharedMod.TabsParameter
  */
  type Parameters = typings.storybookAddonNotes.sharedMod._Parameters | java.lang.String | typings.storybookAddonNotes.sharedMod.TabsParameter
  
  type TabsParameter = typings.std.Record[java.lang.String, java.lang.String]
}
