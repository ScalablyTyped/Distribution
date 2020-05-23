package typings.redisInfo.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.redisInfo.anon.Calls
import typings.redisInfo.anon.Expires
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralStats extends js.Object {
  var commands: StringDictionary[Calls]
  var databases: NumberDictionary[Expires]
}

object GeneralStats {
  @scala.inline
  def apply(commands: StringDictionary[Calls], databases: NumberDictionary[Expires]): GeneralStats = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], databases = databases.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralStats]
  }
}

