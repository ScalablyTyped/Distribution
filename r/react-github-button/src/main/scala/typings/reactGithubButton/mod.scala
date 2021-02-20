package typings.reactGithubButton

import typings.react.mod.Component
import typings.reactGithubButton.reactGithubButtonStrings.forks
import typings.reactGithubButton.reactGithubButtonStrings.large
import typings.reactGithubButton.reactGithubButtonStrings.stargazers
import typings.reactGithubButton.reactGithubButtonStrings.watchers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-github-button", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactGitHubButtonProps, js.Object, js.Any]
  
  type GitHubButton = Component[ReactGitHubButtonProps, js.Object, js.Any]
  
  @js.native
  trait ReactGitHubButtonProps extends StObject {
    
    /**
      * Your GitHub id or organization name.
      */
    var namespace: String = js.native
    
    /**
      * The name of your repository.
      */
    var repo: String = js.native
    
    /**
      * The size of the button. Leave undefined for default.
      */
    var size: js.UndefOr[large] = js.native
    
    /**
      * The type of information to display
      */
    var `type`: stargazers | watchers | forks = js.native
  }
  object ReactGitHubButtonProps {
    
    @scala.inline
    def apply(namespace: String, repo: String, `type`: stargazers | watchers | forks): ReactGitHubButtonProps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactGitHubButtonProps]
    }
    
    @scala.inline
    implicit class ReactGitHubButtonPropsMutableBuilder[Self <: ReactGitHubButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setType(value: stargazers | watchers | forks): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
