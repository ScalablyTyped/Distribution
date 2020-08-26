package typings.redisInfo.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.redisInfo.anon.Calls
import typings.redisInfo.anon.Expires
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralStats extends js.Object {
  var commands: StringDictionary[Calls] = js.native
  var databases: NumberDictionary[Expires] = js.native
}

object GeneralStats {
  @scala.inline
  def apply(commands: StringDictionary[Calls], databases: NumberDictionary[Expires]): GeneralStats = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], databases = databases.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralStats]
  }
  @scala.inline
  implicit class GeneralStatsOps[Self <: GeneralStats] (val x: Self) extends AnyVal {
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
    def setCommands(value: StringDictionary[Calls]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabases(value: NumberDictionary[Expires]): Self = this.set("databases", value.asInstanceOf[js.Any])
  }
  
}

