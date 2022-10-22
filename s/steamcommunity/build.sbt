organization := "org.scalablytyped"
name := "steamcommunity"
version := "3.43-dt-20220125Z-a0840a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-ad2647",
  "org.scalablytyped" %%% "form-data" % "4.0.0-a4cd97",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-2dc481",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-69f8cb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-0fe4d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
