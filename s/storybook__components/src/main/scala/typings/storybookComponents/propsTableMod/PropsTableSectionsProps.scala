package typings.storybookComponents.propsTableMod

import typings.std.Record
import typings.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsTableSectionsProps extends PropsTableProps {
  var sections: js.UndefOr[Record[String, js.Array[PropDef]]] = js.native
}

object PropsTableSectionsProps {
  @scala.inline
  def apply(sections: Record[String, js.Array[PropDef]] = null): PropsTableSectionsProps = {
    val __obj = js.Dynamic.literal()
    if (sections != null) __obj.updateDynamic("sections")(sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTableSectionsProps]
  }
}

