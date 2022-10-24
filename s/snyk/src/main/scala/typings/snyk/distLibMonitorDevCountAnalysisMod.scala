package typings.snyk

import typings.snyk.anon.EndDate
import typings.snyk.distLibTypesMod.Contributor
import typings.std.Error
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibMonitorDevCountAnalysisMod {
  
  @JSImport("snyk/dist/lib/monitor/dev-count-analysis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/monitor/dev-count-analysis", "CONTRIBUTING_DEVELOPER_PERIOD_DAYS")
  @js.native
  val CONTRIBUTING_DEVELOPER_PERIOD_DAYS: /* 90 */ Double = js.native
  
  @JSImport("snyk/dist/lib/monitor/dev-count-analysis", "GitCommitInfo")
  @js.native
  open class GitCommitInfo protected () extends StObject {
    def this(authorEmail: String, commitTimestamp: String) = this()
    
    var authorEmail: String = js.native
    
    var commitTimestamp: String = js.native
  }
  
  @JSImport("snyk/dist/lib/monitor/dev-count-analysis", "GitRepoCommitStats")
  @js.native
  open class GitRepoCommitStats protected () extends StObject {
    def this(commitInfos: js.Array[GitCommitInfo]) = this()
    
    def addCommitInfo(info: GitCommitInfo): Unit = js.native
    
    var commitInfos: js.Array[GitCommitInfo] = js.native
    
    def getCommitsCount(): Double = js.native
    
    def getMostRecentCommitTimestamp(authorHashedEmail: String): String = js.native
    
    def getRepoContributors(): js.Array[Contributor] = js.native
    
    def getUniqueAuthorEmails(): Set[String] = js.native
    
    def getUniqueAuthorsCount(): Double = js.native
  }
  /* static members */
  object GitRepoCommitStats {
    
    @JSImport("snyk/dist/lib/monitor/dev-count-analysis", "GitRepoCommitStats")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): GitRepoCommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[GitRepoCommitStats]
  }
  
  @JSImport("snyk/dist/lib/monitor/dev-count-analysis", "MAX_COMMITS_IN_GIT_LOG")
  @js.native
  val MAX_COMMITS_IN_GIT_LOG: /* 500 */ Double = js.native
  
  @JSImport("snyk/dist/lib/monitor/dev-count-analysis", "SERIOUS_DELIMITER")
  @js.native
  val SERIOUS_DELIMITER: /* "_SNYK_SEPARATOR_" */ String = js.native
  
  @JSImport("snyk/dist/lib/monitor/dev-count-analysis", "ShellOutError")
  @js.native
  open class ShellOutError protected ()
    extends StObject
       with Error {
    def this(message: String, exitCode: Double, stdout: String, stderr: String) = this()
    def this(message: String, exitCode: Unit, stdout: String, stderr: String) = this()
    def this(message: String, exitCode: Double, stdout: String, stderr: String, innerError: js.Error) = this()
    def this(message: String, exitCode: Unit, stdout: String, stderr: String, innerError: js.Error) = this()
    
    var exitCode: js.UndefOr[Double] = js.native
    
    var innerError: js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var stderr: js.UndefOr[String] = js.native
    
    var stdout: js.UndefOr[String] = js.native
  }
  
  inline def execShell(cmd: String, workingDirectory: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execShell")(cmd.asInstanceOf[js.Any], workingDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getContributors(): js.Promise[js.Array[Contributor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContributors")().asInstanceOf[js.Promise[js.Array[Contributor]]]
  inline def getContributors(param0: EndDate): js.Promise[js.Array[Contributor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContributors")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Contributor]]]
  
  inline def getTimestampStartOfContributingDevTimeframe(dNow: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimestampStartOfContributingDevTimeframe")(dNow.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getTimestampStartOfContributingDevTimeframe(dNow: js.Date, timespanInDays: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimestampStartOfContributingDevTimeframe")(dNow.asInstanceOf[js.Any], timespanInDays.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parseGitLog(gitLog: String): GitRepoCommitStats = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGitLog")(gitLog.asInstanceOf[js.Any]).asInstanceOf[GitRepoCommitStats]
  
  inline def parseGitLogLine(logLine: String): GitCommitInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGitLogLine")(logLine.asInstanceOf[js.Any]).asInstanceOf[GitCommitInfo]
  
  inline def runGitLog(
    timestampEpochSecondsStartOfPeriod: Double,
    timestampEpochSecondsEndOfPeriod: Double,
    repoPath: String,
    fnShellout: js.Function2[/* cmd */ String, /* workingDirectory */ String, js.Promise[String]]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("runGitLog")(timestampEpochSecondsStartOfPeriod.asInstanceOf[js.Any], timestampEpochSecondsEndOfPeriod.asInstanceOf[js.Any], repoPath.asInstanceOf[js.Any], fnShellout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def separateLines(inputText: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateLines")(inputText.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
