package typings.ramlTypesystem.typesystemMod

import typings.ramlTypesystem.schemaUtilMod.IContentProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "ExternalType")
@js.native
open class ExternalType protected () extends InheritedType {
  def this(name: String, _content: String, json: Boolean, provider: IContentProvider) = this()
  def this(
    name: String,
    _content: String,
    json: Boolean,
    provider: IContentProvider,
    typeAttributeProvider: IContentProvider
  ) = this()
  
  /* private */ var _content: Any = js.native
  
  def getContentProvider(): IContentProvider = js.native
  
  def isJSON(): Boolean = js.native
  
  /* private */ var json: Any = js.native
  
  /* private */ var provider: Any = js.native
  
  def schema(): String = js.native
  
  def setContentProvider(provider: IContentProvider): Unit = js.native
}
/* static members */
object ExternalType {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "ExternalType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "ExternalType.CLASS_IDENTIFIER_ExternalType")
  @js.native
  def CLASS_IDENTIFIER_ExternalType: Any = js.native
  inline def CLASS_IDENTIFIER_ExternalType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER_ExternalType")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-typesystem.raml-typesystem/dist/src/typesystem.ExternalType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-typesystem.raml-typesystem/dist/src/typesystem.ExternalType */ Boolean]
}
