organization := "org.scalablytyped"
name := "react-codemirror"
version := "v1.0.0-dt-20200227Z-013c55"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20200410Z-30bcc1",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200320Z-7314fa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20191126Z-9575ec")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
