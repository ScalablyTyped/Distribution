package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Concurrency
  extends /* key */ StringDictionary[js.Any] {
  
  var concurrency: StringDictionary[OrgTeamConcurrencyValues] = js.native
  
  var timestamp: Double = js.native
}
object Concurrency {
  
  @scala.inline
  def apply(concurrency: StringDictionary[OrgTeamConcurrencyValues], timestamp: Double): Concurrency = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concurrency]
  }
  
  @scala.inline
  implicit class ConcurrencyOps[Self <: Concurrency] (val x: Self) extends AnyVal {
    
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
    def setConcurrency(value: StringDictionary[OrgTeamConcurrencyValues]): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
