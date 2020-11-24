package typings.reactNativeCommunityCliTypes.anon

import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.after_compile
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.any
import typings.reactNativeCommunityCliTypes.reactNativeCommunityCliTypesStrings.before_compile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dependencyfile extends js.Object {
  
  var dependency_file: js.UndefOr[String] = js.native
  
  var execution_position: js.UndefOr[before_compile | after_compile | any] = js.native
  
  var input_file_lists: js.UndefOr[js.Array[String]] = js.native
  
  var input_files: js.UndefOr[js.Array[String]] = js.native
  
  var name: String = js.native
  
  var output_file_lists: js.UndefOr[js.Array[String]] = js.native
  
  var output_files: js.UndefOr[js.Array[String]] = js.native
  
  var shell_path: js.UndefOr[String] = js.native
  
  var show_env_vars_in_log: js.UndefOr[Boolean] = js.native
}
object Dependencyfile {
  
  @scala.inline
  def apply(name: String): Dependencyfile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependencyfile]
  }
  
  @scala.inline
  implicit class DependencyfileOps[Self <: Dependencyfile] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependency_file(value: String): Self = this.set("dependency_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependency_file: Self = this.set("dependency_file", js.undefined)
    
    @scala.inline
    def setExecution_position(value: before_compile | after_compile | any): Self = this.set("execution_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecution_position: Self = this.set("execution_position", js.undefined)
    
    @scala.inline
    def setInput_file_listsVarargs(value: String*): Self = this.set("input_file_lists", js.Array(value :_*))
    
    @scala.inline
    def setInput_file_lists(value: js.Array[String]): Self = this.set("input_file_lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_file_lists: Self = this.set("input_file_lists", js.undefined)
    
    @scala.inline
    def setInput_filesVarargs(value: String*): Self = this.set("input_files", js.Array(value :_*))
    
    @scala.inline
    def setInput_files(value: js.Array[String]): Self = this.set("input_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_files: Self = this.set("input_files", js.undefined)
    
    @scala.inline
    def setOutput_file_listsVarargs(value: String*): Self = this.set("output_file_lists", js.Array(value :_*))
    
    @scala.inline
    def setOutput_file_lists(value: js.Array[String]): Self = this.set("output_file_lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput_file_lists: Self = this.set("output_file_lists", js.undefined)
    
    @scala.inline
    def setOutput_filesVarargs(value: String*): Self = this.set("output_files", js.Array(value :_*))
    
    @scala.inline
    def setOutput_files(value: js.Array[String]): Self = this.set("output_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput_files: Self = this.set("output_files", js.undefined)
    
    @scala.inline
    def setShell_path(value: String): Self = this.set("shell_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShell_path: Self = this.set("shell_path", js.undefined)
    
    @scala.inline
    def setShow_env_vars_in_log(value: Boolean): Self = this.set("show_env_vars_in_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_env_vars_in_log: Self = this.set("show_env_vars_in_log", js.undefined)
  }
}
