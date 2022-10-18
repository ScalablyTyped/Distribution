package typings.sidewayAddress

import typings.sidewayAddress.distDomainMod.Analysis
import typings.sidewayAddress.distDomainMod.DomainOptions
import typings.sidewayAddress.distEmailMod.EmailOptions
import typings.sidewayAddress.distIpMod.Expression
import typings.sidewayAddress.distIpMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sideway/address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def analyzeDomain(domain: String): Analysis | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Analysis | Null]
  inline def analyzeDomain(domain: String, options: DomainOptions): Analysis | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeDomain")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analysis | Null]
  
  inline def analyzeEmail(email: String): Analysis | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Analysis | Null]
  inline def analyzeEmail(email: String, options: EmailOptions): Analysis | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("analyzeEmail")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analysis | Null]
  
  @JSImport("@sideway/address", "errorCodes")
  @js.native
  val errorCodes: Record[String, String] = js.native
  
  inline def ipRegex(): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("ipRegex")().asInstanceOf[Expression]
  inline def ipRegex(options: Options): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("ipRegex")(options.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def isDomainValid(domain: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomainValid")(domain.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDomainValid(domain: String, options: DomainOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDomainValid")(domain.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEmailValid(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmailValid")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEmailValid(email: String, options: EmailOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmailValid")(email.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def uriDecode(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriDecode")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def uriRegex(): typings.sidewayAddress.distUriMod.Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("uriRegex")().asInstanceOf[typings.sidewayAddress.distUriMod.Expression]
  inline def uriRegex(options: typings.sidewayAddress.distUriMod.Options): typings.sidewayAddress.distUriMod.Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("uriRegex")(options.asInstanceOf[js.Any]).asInstanceOf[typings.sidewayAddress.distUriMod.Expression]
  
  inline def validateDomainOptions(options: DomainOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDomainOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
