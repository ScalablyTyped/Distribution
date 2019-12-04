package typings.atStorybookAddonDashNotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSharedMod {
  import typings.std.Record

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.atStorybookAddonDashNotes.distSharedMod.TextParameter
    - typings.atStorybookAddonDashNotes.distSharedMod.MarkdownParameter
    - typings.atStorybookAddonDashNotes.distSharedMod.DisabledParameter
    - typings.atStorybookAddonDashNotes.distSharedMod.TabsParameter
  */
  type Parameters = _Parameters | String | TabsParameter
  type TabsParameter = Record[String, String]
}
