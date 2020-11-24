package typings.reactTextMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexesOfPipedChars extends js.Object {
  
  var indexesOfPipedChars: js.Array[Double] = js.native
  
  var value: String = js.native
}
object IndexesOfPipedChars {
  
  @scala.inline
  def apply(indexesOfPipedChars: js.Array[Double], value: String): IndexesOfPipedChars = {
    val __obj = js.Dynamic.literal(indexesOfPipedChars = indexesOfPipedChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexesOfPipedChars]
  }
  
  @scala.inline
  implicit class IndexesOfPipedCharsOps[Self <: IndexesOfPipedChars] (val x: Self) extends AnyVal {
    
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
    def setIndexesOfPipedCharsVarargs(value: Double*): Self = this.set("indexesOfPipedChars", js.Array(value :_*))
    
    @scala.inline
    def setIndexesOfPipedChars(value: js.Array[Double]): Self = this.set("indexesOfPipedChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
