package typings.rollupPluginTypescript2.ioptionsMod

import typings.typescript.mod.Bundle
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformationContext
import typings.typescript.mod.Transformer
import typings.typescript.mod.TransformerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomTransformer extends js.Object {
  
  var after: js.UndefOr[TransformerFactory[SourceFile]] = js.native
  
  var afterDeclarations: js.UndefOr[TransformerFactory[Bundle | SourceFile]] = js.native
  
  var before: js.UndefOr[TransformerFactory[SourceFile]] = js.native
}
object ICustomTransformer {
  
  @scala.inline
  def apply(): ICustomTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomTransformer]
  }
  
  @scala.inline
  implicit class ICustomTransformerOps[Self <: ICustomTransformer] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: /* context */ TransformationContext => Transformer[SourceFile]): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterDeclarations(value: /* context */ TransformationContext => Transformer[Bundle | SourceFile]): Self = this.set("afterDeclarations", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterDeclarations: Self = this.set("afterDeclarations", js.undefined)
    
    @scala.inline
    def setBefore(value: /* context */ TransformationContext => Transformer[SourceFile]): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
}
