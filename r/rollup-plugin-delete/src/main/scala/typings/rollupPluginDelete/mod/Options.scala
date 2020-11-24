package typings.rollupPluginDelete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends typings.del.mod.Options {
  
  /**
    * Rollup hook the plugin should use.
    * @default 'buildStart'
    */
  val hook: js.UndefOr[String] = js.native
  
  /**
    * Delete items once. Useful in watch mode.
    * @default false
    */
  val runOnce: js.UndefOr[Boolean] = js.native
  
  /**
    * Patterns of files and folders to be deleted.
    * @default []
    */
  val targets: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Outputs removed files and folders to console.
    * @default false
    */
  val verbose: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setHook(value: String): Self = this.set("hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHook: Self = this.set("hook", js.undefined)
    
    @scala.inline
    def setRunOnce(value: Boolean): Self = this.set("runOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnce: Self = this.set("runOnce", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: String*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: String | js.Array[String]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
