organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-3aadcf"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "framesync" % "4.0.4-140f2e",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-3871b3",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-8f513b",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-77add4",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-7861a3",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-831324",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-3df265",
  "org.scalablytyped" %%% "stylefire" % "7.0.2-365b15")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
