package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergedRollupOptions extends InputOptions {
  
  var output: js.Array[OutputOptions] = js.native
}
object MergedRollupOptions {
  
  @scala.inline
  def apply(output: js.Array[OutputOptions]): MergedRollupOptions = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedRollupOptions]
  }
  
  @scala.inline
  implicit class MergedRollupOptionsOps[Self <: MergedRollupOptions] (val x: Self) extends AnyVal {
    
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
    def setOutputVarargs(value: OutputOptions*): Self = this.set("output", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[OutputOptions]): Self = this.set("output", value.asInstanceOf[js.Any])
  }
}
