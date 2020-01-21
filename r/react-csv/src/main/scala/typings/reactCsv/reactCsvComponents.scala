package typings.reactCsv

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactCsvComponents extends reactCsvProps {
  @scala.inline
  def CSVDownload: ComponentType[CSVDownloadProps] = js.constructorOf[typings.reactCsv.mod.CSVDownload].asInstanceOf[typings.react.mod.ComponentType[CSVDownloadProps]]
  @scala.inline
  def CSVLink: ComponentType[CSVLinkProps] = js.constructorOf[typings.reactCsv.mod.CSVLink].asInstanceOf[typings.react.mod.ComponentType[CSVLinkProps]]
  @scala.inline
  def Download: ComponentType[DownloadProps] = js.constructorOf[typings.reactCsv.downloadMod.default].asInstanceOf[typings.react.mod.ComponentType[DownloadProps]]
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.reactCsv.linkMod.default].asInstanceOf[typings.react.mod.ComponentType[LinkProps]]
}

