package typings.sanitizeS3Objectkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(objectKey: String): String = ^.asInstanceOf[js.Dynamic].apply(objectKey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(objectKey: String, separator: String): String = (^.asInstanceOf[js.Dynamic].apply(objectKey.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(objectKey: Double): String = ^.asInstanceOf[js.Dynamic].apply(objectKey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(objectKey: Double, separator: String): String = (^.asInstanceOf[js.Dynamic].apply(objectKey.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("sanitize-s3-objectkey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
