package typings.redisInfo.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.redisInfo.AnonCalls
import typings.redisInfo.AnonExpires
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneralStats extends js.Object {
  var commands: StringDictionary[AnonCalls]
  var databases: NumberDictionary[AnonExpires]
}

object GeneralStats {
  @scala.inline
  def apply(commands: StringDictionary[AnonCalls], databases: NumberDictionary[AnonExpires]): GeneralStats = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], databases = databases.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeneralStats]
  }
}

