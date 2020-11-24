package typings.sqltoolsFormatter.typesMod

import typings.sqltoolsFormatter.sqltoolsFormatterStrings.db2
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.lower
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.n1ql
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.plSlashsql
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.preserve
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.sql
import typings.sqltoolsFormatter.sqltoolsFormatterStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var indent: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[sql | db2 | n1ql | plSlashsql] = js.native
  
  var linesBetweenQueries: js.UndefOr[Double | preserve] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var reservedWordCase: js.UndefOr[upper | lower] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setLanguage(value: sql | db2 | n1ql | plSlashsql): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLinesBetweenQueries(value: Double | preserve): Self = this.set("linesBetweenQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinesBetweenQueries: Self = this.set("linesBetweenQueries", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setReservedWordCase(value: upper | lower): Self = this.set("reservedWordCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedWordCase: Self = this.set("reservedWordCase", js.undefined)
  }
}
