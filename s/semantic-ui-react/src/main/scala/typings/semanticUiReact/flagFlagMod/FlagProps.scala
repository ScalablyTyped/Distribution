package typings.semanticUiReact.flagFlagMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlagProps
  extends StrictFlagProps
     with /* key */ StringDictionary[js.Any]

object FlagProps {
  @scala.inline
  def apply(name: FlagNameValues): FlagProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagProps]
  }
}

