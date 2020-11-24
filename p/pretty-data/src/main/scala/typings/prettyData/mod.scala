package typings.prettyData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pretty-data", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object pd extends js.Object {
    
    def css(data: String): String = js.native
    def css(data: String, preserveComments: Boolean): String = js.native
    
    def cssmin(data: String): String = js.native
    
    def json(data: String): String = js.native
    
    def jsonmin(data: String): String = js.native
    
    def sql(data: String): String = js.native
    
    def sqlmin(data: String): String = js.native
    
    def xml(data: String): String = js.native
    
    def xmlmin(data: String): String = js.native
    def xmlmin(data: String, preserveComments: Boolean): String = js.native
  }
}
