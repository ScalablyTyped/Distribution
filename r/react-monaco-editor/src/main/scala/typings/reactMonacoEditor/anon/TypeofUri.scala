package typings.reactMonacoEditor.anon

import org.scalablytyped.runtime.Instantiable0
import typings.monacoEditor.anon.Fragment
import typings.monacoEditor.mod.Uri
import typings.monacoEditor.mod.UriComponents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUri extends Instantiable0[Uri] {
  
  /**
    * Creates a new Uri from a file system path, e.g. `c:\my\files`,
    * `/usr/home`, or `\\server\share\some\path`.
    *
    * The *difference* between `Uri#parse` and `Uri#file` is that the latter treats the argument
    * as path, not as stringified-uri. E.g. `Uri.file(path)` is **not the same as**
    * `Uri.parse('file://' + path)` because the path might contain characters that are
    * interpreted (# and ?). See the following sample:
    * ```ts
    const good = Uri.file('/coding/c#/project1');
    good.scheme === 'file';
    good.path === '/coding/c#/project1';
    good.fragment === '';
    const bad = Uri.parse('file://' + '/coding/c#/project1');
    bad.scheme === 'file';
    bad.path === '/coding/c'; // path is now broken
    bad.fragment === '/project1';
    ```
    *
    * @param path A file system path (see `Uri#fsPath`)
    */
  def file(path: String): Uri = js.native
  
  def from(components: Fragment): Uri = js.native
  
  def isUri(thing: js.Any): /* is monaco-editor.monaco-editor.Uri */ Boolean = js.native
  
  /**
    * Join a Uri path with path fragments and normalizes the resulting path.
    *
    * @param uri The input Uri.
    * @param pathFragment The path fragment to add to the Uri path.
    * @returns The resulting Uri.
    */
  def joinPath(uri: Uri, pathFragment: String*): Uri = js.native
  
  /**
    * Creates a new Uri from a string, e.g. `http://www.msft.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * @param value A string which represents an Uri (see `Uri#toString`).
    */
  def parse(value: String): Uri = js.native
  def parse(value: String, _strict: Boolean): Uri = js.native
  
  def revive(): js.UndefOr[Uri] = js.native
  def revive(data: Uri): js.UndefOr[Uri] = js.native
  def revive(data: UriComponents): js.UndefOr[Uri] = js.native
  @JSName("revive")
  def revive_Uri(data: Uri): Uri = js.native
  @JSName("revive")
  def revive_Uri(data: UriComponents): Uri = js.native
}
