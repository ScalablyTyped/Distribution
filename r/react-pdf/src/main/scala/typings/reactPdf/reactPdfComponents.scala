package typings.reactPdf

import typings.react.mod.ComponentType
import typings.reactPdf.documentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactPdfComponents extends reactPdfProps {
  @scala.inline
  def Document: ComponentType[DocumentProps] = js.constructorOf[default].asInstanceOf[ComponentType[DocumentProps]]
  @scala.inline
  def Outline: ComponentType[OutlineProps] = js.constructorOf[typings.reactPdf.outlineMod.default].asInstanceOf[ComponentType[OutlineProps]]
  @scala.inline
  def Page: ComponentType[PageProps] = js.constructorOf[typings.reactPdf.pageMod.default].asInstanceOf[ComponentType[PageProps]]
}

