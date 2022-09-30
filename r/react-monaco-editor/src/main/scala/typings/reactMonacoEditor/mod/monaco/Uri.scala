package typings.reactMonacoEditor.mod.monaco

import typings.monacoEditor.anon.Fragment
import typings.monacoEditor.mod.UriComponents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-monaco-editor", "monaco.Uri")
@js.native
open class Uri ()
  extends typings.monacoEditor.mod.Uri
/* static members */
object Uri {
  
  @JSImport("react-monaco-editor", "monaco.Uri")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def file(path: String): typings.monacoEditor.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Uri]
  
  inline def from(components: Fragment): typings.monacoEditor.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(components.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Uri]
  
  inline def isUri(thing: Any): /* is monaco-editor.monaco-editor.Uri */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUri")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is monaco-editor.monaco-editor.Uri */ Boolean]
  
  /**
    * Join a Uri path with path fragments and normalizes the resulting path.
    *
    * @param uri The input Uri.
    * @param pathFragment The path fragment to add to the Uri path.
    * @returns The resulting Uri.
    */
  inline def joinPath(uri: typings.monacoEditor.mod.Uri, pathFragment: String*): typings.monacoEditor.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPath")(scala.List(uri.asInstanceOf[js.Any]).`++`(pathFragment.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.monacoEditor.mod.Uri]
  
  /**
    * Creates a new Uri from a string, e.g. `http://www.example.com/some/path`,
    * `file:///usr/home`, or `scheme:with/path`.
    *
    * @param value A string which represents an Uri (see `Uri#toString`).
    */
  inline def parse(value: String): typings.monacoEditor.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Uri]
  inline def parse(value: String, _strict: Boolean): typings.monacoEditor.mod.Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], _strict.asInstanceOf[js.Any])).asInstanceOf[typings.monacoEditor.mod.Uri]
  
  inline def revive(): js.UndefOr[typings.monacoEditor.mod.Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")().asInstanceOf[js.UndefOr[typings.monacoEditor.mod.Uri]]
  inline def revive(data: typings.monacoEditor.mod.Uri): js.UndefOr[typings.monacoEditor.mod.Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.monacoEditor.mod.Uri]]
  inline def revive(data: UriComponents): js.UndefOr[typings.monacoEditor.mod.Uri] = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.monacoEditor.mod.Uri]]
  
  inline def revive_Uri(data: typings.monacoEditor.mod.Uri): typings.monacoEditor.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Uri]
  inline def revive_Uri(data: UriComponents): typings.monacoEditor.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("revive")(data.asInstanceOf[js.Any]).asInstanceOf[typings.monacoEditor.mod.Uri]
}
