package typings.reactInfiniteCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceInWords extends js.Object {
  
  def distanceInWords(token: js.Any, count: js.Any, options: js.Any): js.Any = js.native
  
  def format(): js.Any = js.native
}
object DistanceInWords {
  
  @scala.inline
  def apply(distanceInWords: (js.Any, js.Any, js.Any) => js.Any, format: () => js.Any): DistanceInWords = {
    val __obj = js.Dynamic.literal(distanceInWords = js.Any.fromFunction3(distanceInWords), format = js.Any.fromFunction0(format))
    __obj.asInstanceOf[DistanceInWords]
  }
  
  @scala.inline
  implicit class DistanceInWordsOps[Self <: DistanceInWords] (val x: Self) extends AnyVal {
    
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
    def setDistanceInWords(value: (js.Any, js.Any, js.Any) => js.Any): Self = this.set("distanceInWords", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormat(value: () => js.Any): Self = this.set("format", js.Any.fromFunction0(value))
  }
}
