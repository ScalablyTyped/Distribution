package typings.sentiment.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sentiment.anon.Apply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageModule extends js.Object {
  
  var labels: StringDictionary[Double] = js.native
  
  var scoringStrategy: js.UndefOr[Apply] = js.native
}
object LanguageModule {
  
  @scala.inline
  def apply(labels: StringDictionary[Double]): LanguageModule = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageModule]
  }
  
  @scala.inline
  implicit class LanguageModuleOps[Self <: LanguageModule] (val x: Self) extends AnyVal {
    
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
    def setLabels(value: StringDictionary[Double]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoringStrategy(value: Apply): Self = this.set("scoringStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoringStrategy: Self = this.set("scoringStrategy", js.undefined)
  }
}
