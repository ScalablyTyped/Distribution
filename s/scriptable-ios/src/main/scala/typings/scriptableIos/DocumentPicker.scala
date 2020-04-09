package typings.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Presents a document picker._
  * @see https://docs.scriptable.app/documentpicker
  */
@JSGlobal("DocumentPicker")
@js.native
object DocumentPicker extends js.Object {
  /**
    * _Exports a file to a document._
    *
    * Exports the file to a document with. A picker prompting for a destination to export the document to is presented.
    * @param path - Path of the file to export.
    * @see https://docs.scriptable.app/documentpicker/#export
    */
  def export(path: String): js.Promise[js.Array[String]] = js.native
  /**
    * _Exports an image._
    *
    * Exports an image to a new file. The name of the file can optionally be specified. A picker prompting for a destination to export the document to is presented.
    * @param image - Image to export.
    * @param name - Optional name of the image to export.
    * @see https://docs.scriptable.app/documentpicker/#exportimage
    */
  def exportImage(image: Image): js.Promise[js.Array[String]] = js.native
  def exportImage(image: Image, name: String): js.Promise[js.Array[String]] = js.native
  /**
    * _Exports a string to a document._
    *
    * Exports a string to a new file. The name of the file can optionally be specified. A picker prompting for a destination to export the document to is presented.
    * @param content - Content of the document to export.
    * @param name - Optional name of the document to export.
    * @see https://docs.scriptable.app/documentpicker/#exportstring
    */
  def exportString(content: String): js.Promise[js.Array[String]] = js.native
  def exportString(content: String, name: String): js.Promise[js.Array[String]] = js.native
  /**
    * _Opens a document._
    *
    * Presents a document picker for opening a document from the Files app. It is up to the user to specify which types of files can be opened. Types are specified as UTIs, e.g.
    * "public.plain-text" or "public.image". If you want to open a file of any file type, see the `openFile` function and if you want to open a folder, see the `openFolder` function.
    *
    * When fulfilled the returned promise will provide the paths for the selected documents. Use an instance of FileManager to read the contents of the files.
    * @param types - Types of files to select. Specified using UTIs. Defaults to all files.
    * @see https://docs.scriptable.app/documentpicker/#open
    */
  def open(): js.Promise[js.Array[String]] = js.native
  def open(types: js.Array[String]): js.Promise[js.Array[String]] = js.native
  /**
    * _Opens a file of any file type._
    *
    * Presents a document picker for opening a file from the Files app. The document picker will allow the selection of any file.
    *
    * When fulfilled the returned promise will provide the paths for the selected files.
    * @see https://docs.scriptable.app/documentpicker/#openfile
    */
  def openFile(): js.Promise[String] = js.native
  /**
    * _Opens a folder._
    *
    * Presents a document picker for opening a folder from the Files app.
    *
    * When fulfilled the returned promise will provide the paths for the selected files.
    * @see https://docs.scriptable.app/documentpicker/#openfolder
    */
  def openFolder(): js.Promise[String] = js.native
}

