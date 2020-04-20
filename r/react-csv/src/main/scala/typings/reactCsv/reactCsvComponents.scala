package typings.reactCsv

import typings.react.mod.ComponentType
import typings.reactCsv.downloadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactCsvComponents extends reactCsvProps {
  @scala.inline
  def CSVDownload: ComponentType[CSVDownloadProps] = js.constructorOf[typings.reactCsv.mod.CSVDownload].asInstanceOf[ComponentType[CSVDownloadProps]]
  @scala.inline
  def CSVLink: ComponentType[CSVLinkProps] = js.constructorOf[typings.reactCsv.mod.CSVLink].asInstanceOf[ComponentType[CSVLinkProps]]
  @scala.inline
  def Download: ComponentType[DownloadProps] = js.constructorOf[default].asInstanceOf[ComponentType[DownloadProps]]
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.reactCsv.linkMod.default].asInstanceOf[ComponentType[LinkProps]]
}

