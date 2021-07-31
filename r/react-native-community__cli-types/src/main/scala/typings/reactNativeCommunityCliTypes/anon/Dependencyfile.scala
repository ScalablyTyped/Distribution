package typings.reactNativeCommunityCliTypes.anon

import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.after_compile
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.any
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.before_compile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependencyfile extends StObject {
  
  var dependency_file: js.UndefOr[String] = js.undefined
  
  var execution_position: js.UndefOr[before_compile | after_compile | any] = js.undefined
  
  var input_file_lists: js.UndefOr[js.Array[String]] = js.undefined
  
  var input_files: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var output_file_lists: js.UndefOr[js.Array[String]] = js.undefined
  
  var output_files: js.UndefOr[js.Array[String]] = js.undefined
  
  var shell_path: js.UndefOr[String] = js.undefined
  
  var show_env_vars_in_log: js.UndefOr[Boolean] = js.undefined
}
object Dependencyfile {
  
  @scala.inline
  def apply(name: String): Dependencyfile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependencyfile]
  }
  
  @scala.inline
  implicit class DependencyfileMutableBuilder[Self <: Dependencyfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependency_file(value: String): Self = StObject.set(x, "dependency_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependency_fileUndefined: Self = StObject.set(x, "dependency_file", js.undefined)
    
    @scala.inline
    def setExecution_position(value: before_compile | after_compile | any): Self = StObject.set(x, "execution_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_positionUndefined: Self = StObject.set(x, "execution_position", js.undefined)
    
    @scala.inline
    def setInput_file_lists(value: js.Array[String]): Self = StObject.set(x, "input_file_lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_file_listsUndefined: Self = StObject.set(x, "input_file_lists", js.undefined)
    
    @scala.inline
    def setInput_file_listsVarargs(value: String*): Self = StObject.set(x, "input_file_lists", js.Array(value :_*))
    
    @scala.inline
    def setInput_files(value: js.Array[String]): Self = StObject.set(x, "input_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_filesUndefined: Self = StObject.set(x, "input_files", js.undefined)
    
    @scala.inline
    def setInput_filesVarargs(value: String*): Self = StObject.set(x, "input_files", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_file_lists(value: js.Array[String]): Self = StObject.set(x, "output_file_lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_file_listsUndefined: Self = StObject.set(x, "output_file_lists", js.undefined)
    
    @scala.inline
    def setOutput_file_listsVarargs(value: String*): Self = StObject.set(x, "output_file_lists", js.Array(value :_*))
    
    @scala.inline
    def setOutput_files(value: js.Array[String]): Self = StObject.set(x, "output_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_filesUndefined: Self = StObject.set(x, "output_files", js.undefined)
    
    @scala.inline
    def setOutput_filesVarargs(value: String*): Self = StObject.set(x, "output_files", js.Array(value :_*))
    
    @scala.inline
    def setShell_path(value: String): Self = StObject.set(x, "shell_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell_pathUndefined: Self = StObject.set(x, "shell_path", js.undefined)
    
    @scala.inline
    def setShow_env_vars_in_log(value: Boolean): Self = StObject.set(x, "show_env_vars_in_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_env_vars_in_logUndefined: Self = StObject.set(x, "show_env_vars_in_log", js.undefined)
  }
}
