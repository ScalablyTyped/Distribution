package typings.semanticRelease.mod

import org.scalablytyped.runtime.StringDictionary
import typings.semanticRelease.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  /**
    * Environment variables.
    */
  var env: StringDictionary[String] = js.native
  
  /**
    * The previous release details.
    */
  var lastRelease: js.UndefOr[LastRelease] = js.native
  
  /**
    * The shared logger instance of semantic release.
    */
  var logger: Error = js.native
  
  /**
    * The next release details.
    */
  var nextRelease: js.UndefOr[NextRelease] = js.native
  
  /**
    * The semantic release configuration itself.
    */
  var options: js.UndefOr[GlobalConfig] = js.native
}
object Context {
  
  @scala.inline
  def apply(env: StringDictionary[String], logger: Error): Context = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogger(value: Error): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRelease(value: LastRelease): Self = this.set("lastRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRelease: Self = this.set("lastRelease", js.undefined)
    
    @scala.inline
    def setNextRelease(value: NextRelease): Self = this.set("nextRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRelease: Self = this.set("nextRelease", js.undefined)
    
    @scala.inline
    def setOptions(value: GlobalConfig): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
