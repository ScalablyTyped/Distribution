package typings.reactGithubButton.mod

import typings.reactGithubButton.reactGithubButtonStrings.forks
import typings.reactGithubButton.reactGithubButtonStrings.large
import typings.reactGithubButton.reactGithubButtonStrings.stargazers
import typings.reactGithubButton.reactGithubButtonStrings.watchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactGitHubButtonProps extends js.Object {
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
  implicit class ReactGitHubButtonPropsOps[Self <: ReactGitHubButtonProps] (val x: Self) extends AnyVal {
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
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: stargazers | watchers | forks): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

