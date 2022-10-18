package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.OAuth2SecuritySchemeSettingsScalarsAnnotations
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "OAuth2SecuritySchemeSettingsScalarsAnnotationsImpl")
@js.native
open class OAuth2SecuritySchemeSettingsScalarsAnnotationsImpl protected ()
  extends StObject
     with OAuth2SecuritySchemeSettingsScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * OAuth2SecuritySchemeSettings.accessTokenUri annotations
    **/
  /* CompleteClass */
  override def accessTokenUri(): js.Array[AnnotationRef] = js.native
  
  /**
    * OAuth2SecuritySchemeSettings.authorizationGrants annotations
    **/
  /* CompleteClass */
  override def authorizationGrants(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * OAuth2SecuritySchemeSettings.authorizationUri annotations
    **/
  /* CompleteClass */
  override def authorizationUri(): js.Array[AnnotationRef] = js.native
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * OAuth2SecuritySchemeSettings.scopes annotations
    **/
  /* CompleteClass */
  override def scopes(): js.Array[js.Array[AnnotationRef]] = js.native
}
