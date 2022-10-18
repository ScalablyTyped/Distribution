package typings.raml1Parser.distParserHighLevelASTMod

import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStructuredValue extends StObject {
  
  def children(): js.Array[IStructuredValue] = js.native
  
  def lowLevel(): ILowLevelASTNode = js.native
  
  def toHighLevel(): IHighLevelNode = js.native
  def toHighLevel(parent: IHighLevelNode): IHighLevelNode = js.native
  
  def toHighLevel2(): IHighLevelNode = js.native
  def toHighLevel2(parent: IHighLevelNode): IHighLevelNode = js.native
  
  def valueName(): String = js.native
}
